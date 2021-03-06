package com.example.helloperi;


import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothProfile;

import java.util.UUID;

/**
 * UART Profile details
 * MIT Licnese
 * 2016 - Thejesh GN - https://hejeshgn.com
 */

/**
 6E400001-B5A3-F393-E0A9-E50E24DCCA9E for the Service
 6E400002-B5A3-F393-E0A9-E50E24DCCA9E for the RX Characteristic (Property = Notify)
 6E400003-B5A3-F393-E0A9-E50E24DCCA9E for the TX Characteristic (Property = Write without response)
 */

public class UARTProfile {
    //Service UUID to expose our UART characteristics
    public static UUID UART_SERVICE = UUID.fromString("6e400001-b5a3-f393-e0a9-e50e24dcca9e");

    //RX, Write characteristic
    public static UUID RX_WRITE_CHAR = UUID.fromString("6e400002-b5a3-f393-e0a9-e50e24dcca9e");

    //TX READ Notify
    //
    public static UUID TX_READ_CHAR = UUID.fromString("6e400003-b5a3-f393-e0a9-e50e24dcca9e");
    public static UUID TX_READ_CHAR_DESC = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public final static int DESCRIPTOR_PERMISSION = BluetoothGattDescriptor.PERMISSION_WRITE;

    public static String getStateDescription(int state) {
        switch (state) {
            case BluetoothProfile.STATE_CONNECTED:
                return "Connected";
            case BluetoothProfile.STATE_CONNECTING:
                return "Connecting";
            case BluetoothProfile.STATE_DISCONNECTED:
                return "Disconnected";
            case BluetoothProfile.STATE_DISCONNECTING:
                return "Disconnecting";
            default:
                return "Unknown State " + state;
        }
    }


    public static String getStatusDescription(int status) {
        switch (status) {
            case BluetoothGatt.GATT_SUCCESS:
                return "SUCCESS";
            default:
                return "Unknown Status " + status;
        }
    }

}