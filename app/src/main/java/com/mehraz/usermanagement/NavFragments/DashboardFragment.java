package com.mehraz.usermanagement.NavFragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView; // Ensure this line is here
import android.widget.ImageView; // If you're using ImageView
import androidx.fragment.app.Fragment;

import com.mehraz.usermanagement.R;
import com.mehraz.usermanagement.SharedPrefManager;


public class DashboardFragment extends Fragment {

    TextView etname, etemail; // Removed kalerKonto, prothomAlo as TextView
    ImageView imageKalerKonto, imageProthomAlo, imageBbcNews,imageSomokal,imageJugantor,imageInqalab,imageManob,imageNoyadigonto; // Assuming these are the new ImageView IDs
    SharedPrefManager sharedPrefManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        // Initialize TextViews and ImageViews
        etname = view.findViewById(R.id.etname);
        etemail = view.findViewById(R.id.etemail);
        imageKalerKonto = view.findViewById(R.id.imageKalerKonto); // Assuming this is the new ID
        imageProthomAlo = view.findViewById(R.id.imageProthomAlo); // Assuming this is the new ID
        imageBbcNews = view.findViewById(R.id.imageBbcNews); // Assuming this is the new ID
        imageSomokal = view.findViewById(R.id.imageSomokal); // Assuming this is the new ID
        imageJugantor = view.findViewById(R.id.imageJugantor); // Assuming this iges the new ID
        imageInqalab = view.findViewById(R.id.imageInqalab); // Assuming this iges the new ID
        imageManob = view.findViewById(R.id.imageManob); // Assuming this iges the new ID
        imageNoyadigonto = view.findViewById(R.id.imageNoya); // Assuming this iges the new ID

        // Set up SharedPrefManager
        sharedPrefManager = new SharedPrefManager(getActivity());

        // Set user details from SharedPreferences
        String userName = "স্বাগতম! " + sharedPrefManager.getUser().getUsername()+"  আপনার পছন্দের খবরের কাগজ আপনার হাতেই";
        etname.setText(userName);
        etemail.setText(sharedPrefManager.getUser().getEmail());

        // Set click listeners for ImageViews to open URLs
        imageKalerKonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.kalerkantho.com/");
            }
        });

        imageProthomAlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.prothomalo.com/");
            }
        });
        imageBbcNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.bbc.com/news");
            }
        });
        imageSomokal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://samakal.com/");
            }
        });
        imageJugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.jugantor.com/");
            }
        });
        imageInqalab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://dailyinqilab.com/");
            }
        });
        imageManob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.manobkantha.com.bd/");
            }
        });

        imageNoyadigonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWebsite("https://www.dailynayadiganta.com/");
            }
        });


        return view;
    }

    private void openWebsite(String url) {
        // Create an Intent to open the URL
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));

        // Set flag to start a new task
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Verify that there is an app to handle the intent before starting it
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
