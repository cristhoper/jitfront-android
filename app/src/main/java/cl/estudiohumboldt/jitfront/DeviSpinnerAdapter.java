package cl.estudiohumboldt.jitfront;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

class DeviSpinnerAdapter extends ArrayAdapter {
    private ArrayList<BluetoothDevice> mLeDevices;

    DeviSpinnerAdapter(Context ctx){
        super(ctx, android.R.layout.simple_spinner_dropdown_item);
        mLeDevices =  new ArrayList<BluetoothDevice>();
    }

    void addDevice(BluetoothDevice device){
        if (!mLeDevices.contains(device)){
            mLeDevices.add(device);
        }
    }

    public BluetoothDevice getDevice(int pos){
        return mLeDevices.get(pos);
    }

    public void clear(){
        mLeDevices.clear();
    }

    @Override
    public int getCount() {
        return mLeDevices.size();
    }

    @Override
    public Object getItem(int position) {
        return mLeDevices.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
