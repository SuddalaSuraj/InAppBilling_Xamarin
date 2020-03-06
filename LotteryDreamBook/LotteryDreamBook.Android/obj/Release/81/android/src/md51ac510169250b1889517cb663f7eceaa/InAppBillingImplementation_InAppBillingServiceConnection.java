package md51ac510169250b1889517cb663f7eceaa;


public class InAppBillingImplementation_InAppBillingServiceConnection
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.content.ServiceConnection
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onServiceConnected:(Landroid/content/ComponentName;Landroid/os/IBinder;)V:GetOnServiceConnected_Landroid_content_ComponentName_Landroid_os_IBinder_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onServiceDisconnected:(Landroid/content/ComponentName;)V:GetOnServiceDisconnected_Landroid_content_ComponentName_Handler:Android.Content.IServiceConnectionInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Plugin.InAppBilling.InAppBillingImplementation+InAppBillingServiceConnection, Plugin.InAppBilling", InAppBillingImplementation_InAppBillingServiceConnection.class, __md_methods);
	}


	public InAppBillingImplementation_InAppBillingServiceConnection ()
	{
		super ();
		if (getClass () == InAppBillingImplementation_InAppBillingServiceConnection.class)
			mono.android.TypeManager.Activate ("Plugin.InAppBilling.InAppBillingImplementation+InAppBillingServiceConnection, Plugin.InAppBilling", "", this, new java.lang.Object[] {  });
	}

	public InAppBillingImplementation_InAppBillingServiceConnection (int p0)
	{
		super ();
		if (getClass () == InAppBillingImplementation_InAppBillingServiceConnection.class)
			mono.android.TypeManager.Activate ("Plugin.InAppBilling.InAppBillingImplementation+InAppBillingServiceConnection, Plugin.InAppBilling", "Plugin.InAppBilling.Abstractions.ItemType, Plugin.InAppBilling.Abstractions", this, new java.lang.Object[] { p0 });
	}

	public InAppBillingImplementation_InAppBillingServiceConnection (android.content.Context p0, int p1)
	{
		super ();
		if (getClass () == InAppBillingImplementation_InAppBillingServiceConnection.class)
			mono.android.TypeManager.Activate ("Plugin.InAppBilling.InAppBillingImplementation+InAppBillingServiceConnection, Plugin.InAppBilling", "Android.Content.Context, Mono.Android:Plugin.InAppBilling.Abstractions.ItemType, Plugin.InAppBilling.Abstractions", this, new java.lang.Object[] { p0, p1 });
	}


	public void onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1)
	{
		n_onServiceConnected (p0, p1);
	}

	private native void n_onServiceConnected (android.content.ComponentName p0, android.os.IBinder p1);


	public void onServiceDisconnected (android.content.ComponentName p0)
	{
		n_onServiceDisconnected (p0);
	}

	private native void n_onServiceDisconnected (android.content.ComponentName p0);

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
