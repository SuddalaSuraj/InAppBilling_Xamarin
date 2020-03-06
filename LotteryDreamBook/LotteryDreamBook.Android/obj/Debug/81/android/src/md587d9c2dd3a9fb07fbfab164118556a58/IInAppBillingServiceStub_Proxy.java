package md587d9c2dd3a9fb07fbfab164118556a58;


public class IInAppBillingServiceStub_Proxy
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.os.IInterface
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_asBinder:()Landroid/os/IBinder;:GetAsBinderHandler:Android.OS.IInterfaceInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Com.Android.Vending.Billing.IInAppBillingServiceStub+Proxy, Plugin.InAppBilling.VendingLibrary", IInAppBillingServiceStub_Proxy.class, __md_methods);
	}


	public IInAppBillingServiceStub_Proxy ()
	{
		super ();
		if (getClass () == IInAppBillingServiceStub_Proxy.class)
			mono.android.TypeManager.Activate ("Com.Android.Vending.Billing.IInAppBillingServiceStub+Proxy, Plugin.InAppBilling.VendingLibrary", "", this, new java.lang.Object[] {  });
	}

	public IInAppBillingServiceStub_Proxy (android.os.IBinder p0)
	{
		super ();
		if (getClass () == IInAppBillingServiceStub_Proxy.class)
			mono.android.TypeManager.Activate ("Com.Android.Vending.Billing.IInAppBillingServiceStub+Proxy, Plugin.InAppBilling.VendingLibrary", "Android.OS.IBinder, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public android.os.IBinder asBinder ()
	{
		return n_asBinder ();
	}

	private native android.os.IBinder n_asBinder ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
