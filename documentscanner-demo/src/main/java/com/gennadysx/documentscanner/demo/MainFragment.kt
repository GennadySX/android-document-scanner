/*
 * @author GennadySX
 * @created at 2023
 **/

package com.gennadysx.documentscanner.demo

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.gennadysx.documentscanner.DocumentScanner
import com.gennadysx.documentscanner.utils.ImageUtil

class MainFragment: Fragment(R.layout.main_fragment) {


    /**
     * @property croppedImageView the cropped image view
     */
    private lateinit var croppedImageView: ImageView

    /**
     * @property documentScanner the document scanner
     */
    private val documentScanner = DocumentScanner(
        this.requireActivity(),
        { croppedImageResults ->
            // display the first cropped image
            croppedImageView.setImageBitmap(
                ImageUtil().readBitmapFromFileUriString(
                    croppedImageResults.first(),
                    this.requireActivity().contentResolver
                )
            )
        },
        {
            // an error happened
                errorMessage -> Log.v("documentscannerlogs", errorMessage)
        },
        {
            // user canceled document scan
            Log.v("documentscannerlogs", "User canceled document scan")
        }
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // cropped image
        croppedImageView = view.findViewById(R.id.cropped_image_view)

        // start document scan
        documentScanner.startScan()
    }

    }

}