package com.example.android.emojify;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;

import com.google.android.gms.vision.Frame;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;

public class Emojifier {
    public static int detectFaces(Context context, Bitmap bitmap) {
        FaceDetector faceDetector = new FaceDetector.Builder(context).build();
        Frame bitmapFrame = new Frame.Builder().setBitmap(bitmap).build();
        SparseArray<Face> facesIds = faceDetector.detect(bitmapFrame);
        int facesQty = facesIds.size();

        Log.i(Emojifier.class.getName(), "Current bitmap contains " + facesQty + " faces.");

        return facesQty;
    }
}
