import android.os.Environment;

import java.io.File;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by MasEkaSetiawan on 11/6/2016.
 * This module use only for SiEdu application project.
 */

public class storageHandler {

    File folderApp = new File(Environment.getExternalStorageDirectory() + File.separator + "SiEdu");

    public boolean storageCheck() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state) || Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            return TRUE;
        }
        return FALSE;

    }

    public void folderHandler () {
        if(storageCheck()) {
            if (!folderApp.exist()) {
                folderApp.mkdir();
            }
        }
        else {
            // Do something when no storage
        }
    }

    public void fileHandler(){
        if(storageCheck()){
            // Do something when there are a storage
        }
        else{
            // Do something when there are no storage
        }
    }

}