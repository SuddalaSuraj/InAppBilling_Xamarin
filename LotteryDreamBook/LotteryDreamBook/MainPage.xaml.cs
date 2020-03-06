using Plugin.InAppBilling;
using Plugin.InAppBilling.Abstractions;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace LotteryDreamBook
{
    public partial class MainPage : ContentPage
    {
        private int _count = 0;
        public MainPage()
        {
            InitializeComponent();
        }

        private void Buy_Clicked(object sender, EventArgs e)
        {
            MakePurchase();
        }
        private void UpdateResponse(string _string)
        {
            _count++;
            responce_text.Text = responce_text.Text + _count + " . " + _string + ".\n\n";
        }
        private async void MakePurchase()
        {
            if (!CrossInAppBilling.IsSupported)
            {
                UpdateResponse("Billing not supported");
                return;
            }
            else
            {
                UpdateResponse("Billing Supported");
            }

            var billing = CrossInAppBilling.Current;
            var productIds = new string[] { "billing_test_product_1" , "billing_test_product_2" };
            try
            {
                //Connecting to the API.
                bool connected = await billing.ConnectAsync(ItemType.InAppPurchase);

                if (!connected)
                {
                    UpdateResponse("We are offline or can't connect, don't try to purchase");
                     return;
                }
                else
                {
                    UpdateResponse("Connected, proceeding to purchase");
                }

                //Getting purchases.
                IEnumerable<InAppBillingPurchase> purchased = await billing.GetPurchasesAsync(ItemType.InAppPurchase);
                if(purchased != null)
                {
                    foreach(var item in purchased)
                    {
                        UpdateResponse("Purchased\n\t\t" + item.ProductId);
                    }
                }
                else
                {
                    UpdateResponse("No purchases Yet");
                }

                //Creating product list and purchasing.
                var items = await billing.GetProductInfoAsync(ItemType.InAppPurchase, productIds);

                foreach(InAppBillingProduct item in items)
                {
                    string productID = item.ProductId;
                    InAppBillingPurchase purchase = await billing.PurchaseAsync(productID, ItemType.InAppPurchase, "devId");
                    if (purchase == null)
                    {
                        UpdateResponse("Error in purchase, can't purchase");
                    }
                    else if(purchase.State == PurchaseState.Purchased)
                    {
                        UpdateResponse("Purchased the product :" + productID);
                    }
                }
            }
            catch (InAppBillingPurchaseException purchaseEx)
            {
                var message = string.Empty;
                message = (purchaseEx.PurchaseError).ToString();
                UpdateResponse(message);
            }
            catch (Exception ex)
            {
                Debug.WriteLine("Issue connecting: " + ex);
                UpdateResponse(ex.ToString());
            }
            finally
            {
                await billing.DisconnectAsync();
                UpdateResponse("Disconnected from the Billing API");
            }

        }
    }
}
