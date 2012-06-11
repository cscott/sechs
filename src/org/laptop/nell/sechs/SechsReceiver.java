/**
 * 
 */
package org.laptop.nell.sechs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * <code>Sechs</code> is a stripped-down replacement for <code>funf</code>.
 * It attempts to do the job as simply as possible.  It logs events directly
 * to external SD storage, and uses a public key mechanism for meaningful
 * security of the logged data.
 * 
 * @author C. Scott Ananian <cscott@laptop.org>
 */
public class SechsReceiver extends BroadcastReceiver {
    // for debugging
    public static final String TAG = "SechsReceiver";
    
    /* This method class will cease to exist once onReceive returns
     * @see android.content.BroadcastReceiver#onReceive(android.content.Context, android.content.Intent)
     */
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        Log.d(TAG, "got it");
    }

}
