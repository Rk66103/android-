package com.codewithrohit.asyncdemo;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class MyProgressTask extends AsyncTask<Void,Integer,String> {
    Context ctx;
    ProgressDialog pd;


    public MyProgressTask(Context ct){
        ctx=ct;
    }

    @Override
    protected void onPreExecute() {
        pd= new ProgressDialog(ctx);
        pd.setTitle("Downloading");
        pd.setMessage("Please Wait");
        pd.setMax(10);
        pd.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pd.setButton(ProgressDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
                cancel(true);     // cancel button dabane ke baad sbhi tasks stop ho jayege.
            }
        });
        pd.setCancelable(false);
        pd.show();


    }

    @Override
    protected String doInBackground(Void... voids) {
        try {                                   // try method me sirf vhi code aata hai jo future me exception create kr skta hai.
            for (int i = 1; i <= 10; i++) {
                Thread.sleep(1000);
                Log.i("Thread", "Execute" + i);
                publishProgress(i);
            }
                return "Successful";
            }

        catch (Exception e){                  // agar exception aa jati hai try method me to catch method initalize ho jata hai .
            Log.i("Exception", e.getMessage());
            return "Failure";
        }

    }


    @Override
    protected void onProgressUpdate(Integer... values) {
        int myValue= values[0];
        pd.setProgress(myValue);


    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(ctx,"Success",Toast.LENGTH_SHORT).show();
        pd.dismiss();
    }
}
