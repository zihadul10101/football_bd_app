package com.zihadul.football;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.squareup.picasso.BuildConfig;
import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

        /*
    >>Source Code provided by
    >>Jubayer Hossain [https://www.facebook.com/JubayerHossainbd]
    >>Please don't forget to put a review on my site [www.bongoacademy.com]
    >>Share my course with your friends on Facebook
    >>Your positive words help me doing even better
     */

    //====================================================================
    private void addVideos(){
        // We will add all videos here

        //Video Details Here Here
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Txr2YQzsLDU");
        hashMap.put("vdo_title", "নতুনদের জন্য একটি সকার বল জাগলিং");
        hashMap.put("vdo_desciption", "বল জাগলিং প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "L8nLeD9WdVk");
        hashMap.put("vdo_title", "কিভাবে আপনার ড্রিবলিং দক্ষতা উন্নত করবেন");
        hashMap.put("vdo_desciption", "ড্রিবলিং দক্ষতা প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>


        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "4UiKVqQDylM");
        hashMap.put("vdo_title", "কীভাবে আপনার দুর্বল পা উন্নত করবেন");
        hashMap.put("vdo_desciption", "দুর্বল পা প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);
        //------------->>>>>>>>>>>>>>>>>



        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oYgfODvpt58");
        hashMap.put("vdo_title", "কিভাবে সকার/ফুটবলে গতি বাড়ানো যায়");
        hashMap.put("vdo_desciption", "ফুটবলে গতি বাড়ানো প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);



        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "YX45mN-oqJ4");
        hashMap.put("vdo_title", "কিভাবে ফুটবলে আপনার ফুটওয়ার্ক উন্নত করবেন! 4 ব্যায়াম");
        hashMap.put("vdo_desciption", " ফুটওয়ার্ক উন্নত প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "bpv3fejVVt0");
        hashMap.put("vdo_title", "গতি মই ব্যায়াম");
        hashMap.put("vdo_desciption", "ফুটবলে গতি  উন্নত প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "RdrFaNtYKdQ");
        hashMap.put("vdo_title", "কিভাবে বল নিয়ন্ত্রণ উন্নত করা যায়");
        hashMap.put("vdo_desciption", "বল নিয়ন্ত্রণ উন্নত প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "0T4_xmFUuaw");
        hashMap.put("vdo_title", "How to Shoot a Football");
        hashMap.put("vdo_desciption", " Shoot a Football উন্নত প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AdzxLVnOZoY");
        hashMap.put("vdo_title", "বাতাসে একটি বল কীভাবে নিয়ন্ত্রণ করবেন");
        hashMap.put("vdo_desciption", "বাতাসে বল উন্নত প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "5CdThq1KAlI");
        hashMap.put("vdo_title", "দ্রুত পায়ের জন্য 10টি সেরা ফুটওয়ার্ক ব্যায়াম");
        hashMap.put("vdo_desciption", "ফুটওয়ার্ক ব্যায়াম প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nHxClhfQjlM");
        hashMap.put("vdo_title", "10 মিনিটের মধ্যে দ্রুত পা পান! 10 মিনিট ফুটওয়ার্ক ওয়ার্কআউট");
        hashMap.put("vdo_desciption", "10 মিনিট ফুটওয়ার্ক ওয়ার্কআউট প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PoZ9pB05Mgs");
        hashMap.put("vdo_title", "10 মিনিটে 15টি স্কিল মুভ! 10 মিনিট দক্ষতা ওয়ার্কআউট");
        hashMap.put("vdo_desciption", "10 মিনিট দক্ষতা ওয়ার্কআউট প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "7ZSrQDCwEhs");
        hashMap.put("vdo_title", "1v1 ফুটবল দক্ষতা বনাম আমার ভাই!");
        hashMap.put("vdo_desciption", "1v1 ফুটবল দক্ষতা প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oZLEnCbqmyw");
        hashMap.put("vdo_title", "আমার ভাইয়ের সাথে ফুটবল খেলা!");
        hashMap.put("vdo_desciption", "ফুটবল খেলা প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "10W3VLLoKyU");
        hashMap.put("vdo_title", "মাথা ঘোরা পেনাল্টি চ্যালেঞ্জ!");
        hashMap.put("vdo_desciption", "পেনাল্টি  প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "mFIKqWERJ1o");
        hashMap.put("vdo_title", "ফিল্ড বুদ্ধিমত্তা উন্নত! | দ্রুত চিন্তা কর");
        hashMap.put("vdo_desciption", "ফিল্ড  বুদ্ধিমত্তা উন্নত প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Sy1dRfu8boQ");
        hashMap.put("vdo_title", "বাস্তব গেমের জন্য 5টি সহজ মিডফিল্ড দক্ষতা");
        hashMap.put("vdo_desciption", "সহজ মিডফিল্ড প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "UXwUQmVLzik");
        hashMap.put("vdo_title", "একটি বল শ্যুট করার এবং আরও গোল করার সেরা 5টি উপায়");
        hashMap.put("vdo_desciption", "বল শ্যুট করার এবং আরও গোল করার প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "fsi6QrlnzVM");
        hashMap.put("vdo_title", "ডিফেন্ডারদের পরাজিত করার জন্য 5টি সহজ প্রথম স্পর্শ দক্ষতা");
        hashMap.put("vdo_desciption", "ডিফেন্ডারদের পরাজিত করার  প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "y7waNmOTAT0");
        hashMap.put("vdo_title", "রিয়েল গেমসে ডিফেন্ডারদের জায়ফলের সেরা 5টি উপায়");
        hashMap.put("vdo_desciption", "রিয়েল গেমসে ডিফেন্ডারদের প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Cv-1oWn3v70");
        hashMap.put("vdo_title", "বল না হারানোর ৫টি সহজ উপায়!");
        hashMap.put("vdo_desciption", "বল না হারানোর প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "JqxwTcpf07w");
        hashMap.put("vdo_title", "রিয়েল গেমসে বল পাস করার সেরা 5টি উপায়");
        hashMap.put("vdo_desciption", "পাস করার প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Xbs4wHEnFdU");
        hashMap.put("vdo_title", "5টি জিনিস প্রতিটি স্মার্ট প্লেয়ার করে");
        hashMap.put("vdo_desciption", "5টি জিনিস প্রতিটি স্মার্ট প্লেয়ার করে প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1ReCNvOumbs");
        hashMap.put("vdo_title", "ফুটবলে (সকার) ডিফেন্ডারদের পরাজিত করার জন্য 5টি শারীরিক ফিন্টস");
        hashMap.put("vdo_desciption", "ফুটবলে (সকার) ডিফেন্ডারদের পরাজিত করার প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "PagCekTH7XI");
        hashMap.put("vdo_title", "ফুটবল বা সকারে 5টি সেরা ক্রসিং টেকনিক");
        hashMap.put("vdo_desciption", "ফুটবল বা সকারে 5টি সেরা ক্রসিং টেকনিক প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Y9Af7MwsSvc");
        hashMap.put("vdo_title", "কিভাবে সকার/ফুটবলে মিডফিল্ড খেলবেন");
        hashMap.put("vdo_desciption", "কিভাবে সকার/ফুটবলে মিডফিল্ড খেলবেন প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "peeoF4ePJHo");
        hashMap.put("vdo_title", "7টি স্মার্ট প্লে যা আপনাকে আরও ভালো করে তুলবে৷");
        hashMap.put("vdo_desciption", "7টি স্মার্ট প্লে যা আপনাকে আরও ভালো করে তুলবে৷ প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "NrRoUK3ZsnU");
        hashMap.put("vdo_title", "সকার/ফুটবলে আরও গোল করার 7টি উপায়");
        hashMap.put("vdo_desciption", "সকার/ফুটবলে আরও গোল করার 7টি উপায় প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);


        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SHsN8j7HRm4");
        hashMap.put("vdo_title", "ক্রসিং টেকনিক ফুটবল ");
        hashMap.put("vdo_desciption", "ক্রসিং টেকনিক ফুটবল প্রশিক্ষণ কোর্স part-1");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "1VdyP_V8aTc");
        hashMap.put("vdo_title", "ক্রসিং টেকনিক ফুটবল ");
        hashMap.put("vdo_desciption", "ক্রসিং টেকনিক ফুটবল প্রশিক্ষণ কোর্স part-2");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Po8y2Oaob08");
        hashMap.put("vdo_title", "কিভাবে একটি ফুটবল কার্ল!");
        hashMap.put("vdo_desciption", "কিভাবে একটি ফুটবল কার্ল! প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "3J7zjMDhQDg");
        hashMap.put("vdo_title", "কিভাবে মেসির মত চিপ");
        hashMap.put("vdo_desciption", "কিভাবে মেসির মত চিপ  প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "2wjGTnc9mNM");
        hashMap.put("vdo_title", "লং পাস টেকনিক ফুটবল");
        hashMap.put("vdo_desciption", "লং পাস টেকনিক ফুটবল প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "cRwk4qPAEBg");
        hashMap.put("vdo_title", "লং পাস টেকনিক ফুটবল, চালিত পাস");
        hashMap.put("vdo_desciption", "লং পাস টেকনিক ফুটবল, চালিত পাস প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "oRwQd8VBIPM");
        hashMap.put("vdo_title", "কিভাবে আপনার ড্রিবলিং উন্নত করতে হয়");
        hashMap.put("vdo_desciption", " ড্রিবলিং উন্নত  প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "nqE-WMg1FOs");
        hashMap.put("vdo_title", "কিভাবে একটি সকার বল জাগল!");
        hashMap.put("vdo_desciption", "কিভাবে একটি সকার বল জাগল! প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xHC8ozrKgRA");
        hashMap.put("vdo_title", "পাওয়ার শট টেকনিক");
        hashMap.put("vdo_desciption", "পাওয়ার শট টেকনিক প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "WZthasLct_w");
        hashMap.put("vdo_title", "আপনার পায়ের বাইরের সাথে একটি সকার বল কীভাবে বাঁকবেন");
        hashMap.put("vdo_desciption", "সকার বল কীভাবে বাঁকবেন  প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "Sm-u_ESEmjE");
        hashMap.put("vdo_title", "ফুটবলে আপনার পাসিং নির্ভুলতা কীভাবে উন্নত করবেন");
        hashMap.put("vdo_desciption", "ফুটবলে আপনার পাসিং নির্ভুলতা কীভাবে উন্নত করবেন প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "dNB-iS8kHms");
        hashMap.put("vdo_title", "1v1 আক্রমণ");
        hashMap.put("vdo_desciption", "1v1 আক্রমণ প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "hBFKuooKobU");
        hashMap.put("vdo_title", "ফুটবল টিউটোরিয়াল পালা!");
        hashMap.put("vdo_desciption", "ফুটবল টিউটোরিয়াল পালা!  প্রশিক্ষণ কোর্স  ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "InvqGXICwsQ");
        hashMap.put("vdo_title", "ফুটবলে বল ঢাল কিভাবে!");
        hashMap.put("vdo_desciption", "ফুটবলে বল ঢাল কিভাবে! প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "6qv1yeFp9ok");
        hashMap.put("vdo_title", "গোলরক্ষককে কীভাবে মারবেন!");
        hashMap.put("vdo_desciption", "গোলরক্ষককে কীভাবে মারবেন! প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pssaLEEtU2g");
        hashMap.put("vdo_title", "শরীরের ফেইন্টস");
        hashMap.put("vdo_desciption", "শরীরের ফেইন্টস প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "ziXYzblzgzQ");
        hashMap.put("vdo_title", "কিভাবে আপনার ড্রিবলিং উন্নত করবেন, ড্রিবলিং এর 3টি শৈলী");
        hashMap.put("vdo_desciption", "কিভাবে আপনার ড্রিবলিং উন্নত করবেন, ড্রিবলিং এর 3টি শৈলী প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "QH1h6flF5xA");
        hashMap.put("vdo_title", "প্রথম স্পর্শ তিন প্রকার!");
        hashMap.put("vdo_desciption", "প্রথম স্পর্শ তিন প্রকার! প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "pUgiAE9SaJI");
        hashMap.put("vdo_title", "কিভাবে শারীরিক ফিটনেস উন্নত করা যায়");
        hashMap.put("vdo_desciption", "কিভাবে শারীরিক ফিটনেস উন্নত করা যায়  প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "AdzxLVnOZoY");
        hashMap.put("vdo_title", "বাতাসে একটি বল কীভাবে নিয়ন্ত্রণ করবেন");
        hashMap.put("vdo_desciption", "বাতাসে একটি বল কীভাবে নিয়ন্ত্রণ করবেন  প্রশিক্ষণ কোর্স");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "uSPCV-w2Y7I");
        hashMap.put("vdo_title", "নতুনদের জন্য শুটিং উন্নত করার 7টি উপায়!");
        hashMap.put("vdo_desciption", "নতুনদের জন্য শুটিং উন্নত করার 7টি উপায়! প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "xIcUvrTn7FE");
        hashMap.put("vdo_title", "সকারে কার্ভের সাথে কীভাবে শুটিং করবেন");
        hashMap.put("vdo_desciption", "সকারে কার্ভের সাথে কীভাবে শুটিং করবেন প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);

        //------------->>>>>>>>>>>>>>>>>
        hashMap = new HashMap<>();
        hashMap.put("vdo_id", "SxVaMcHqcoU");
        hashMap.put("vdo_title", "নতুনদের জন্য কিভাবে একটি সকার বল জাগল করবেন");
        hashMap.put("vdo_desciption", "নতুনদের জন্য কিভাবে একটি সকার বল জাগল করবেন প্রশিক্ষণ কোর্স ");
        arrayList.add(hashMap);





    }

    //=======================================================
    //====================================================================
    //====================================================================

    TextView tvDate;
    LinearLayout layoutContainer;
    FloatingActionButton fabButton;
    RelativeLayout _rootLay;
    InterstitialAd mInterstitialAd;
    YouTubePlayerView youTubePlayerView;
    YouTubePlayer myYoutubePlayer;
    MyPlaybackEventListener myPlaybackEventListener;
    LinearLayout layPlayer;
    ImageView imngClosePlayer, imgPlayPause, imgPrevious, imgNext;

    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;
    int PLAYING_NOW = 0;
    boolean playingVideo = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        tvDate = findViewById(R.id.tvDate);
        layoutContainer = findViewById(R.id.layoutContainer);
        fabButton = findViewById(R.id.fabButton);
        _rootLay = findViewById(R.id._rootLay);
        youTubePlayerView = findViewById(R.id.youTubePlayerView);
        layPlayer = findViewById(R.id.layPlayer);
        imngClosePlayer = findViewById(R.id.imngClosePlayer);
        imgPlayPause = findViewById(R.id.imgPlayPause);
        imgNext = findViewById(R.id.imgNext);
        imgPrevious = findViewById(R.id.imgPrevious);

        // Load Admob Ads
        loadFullscreenAd();


        if(isAppInstalled("com.google.android.youtube")){
            //init Youtube Player View
            youTubePlayerView.initialize("ABCD", MainActivity.this);
            myPlaybackEventListener = new MyPlaybackEventListener();

        }else{
            showYoutubeInsallDialog();
        }



        //Set Date For Cover Section
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM dd, yyyy", Locale.US);
        formatter.setTimeZone(TimeZone.getDefault());
        Date date1 = new Date();
        String s_date = formatter.format(date1);
        tvDate.setText(s_date);


        //Calling addVideos method by which we will make a video list
        addVideos();
        makeListView();






        //Fab Button onClick
        fabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,
                        "Check "+getString(R.string.app_name)+" app ♥ It's awesome! \n" + "https://play.google.com/store/apps/details?id=" + BuildConfig.APPLICATION_ID);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);

            }
        });

        imngClosePlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                closePlayer();
                fabButton.setVisibility(View.VISIBLE);
                playingVideo = false;



            }
        });

        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v!=null && v.getTag()!=null){
                    String tag = v.getTag().toString();
                    if (tag.contains("PLAYING")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.pause();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();

                    }else if (tag.contains("PAUSED")){
                        if (myYoutubePlayer!=null) myYoutubePlayer.play();
                        else Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playNextVideo();
            }
        });

        imgPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playPreviousVideo();
            }
        });





    } // End of onCreate Bundle





    private void makeListView(){

        ListView listView = new ListView( MainActivity.this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(150, 10);
        layoutParams.height = ViewGroup.LayoutParams.WRAP_CONTENT;
        layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT;
        listView.setBackgroundColor(Color.WHITE);
        listView.setLayoutParams(layoutParams);

        //Adding ListView into our view
        layoutContainer.addView(listView);
        //------------
        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
        //-----------


        try{
            setListViewHeightBasedOnChildren(listView);
        } catch(Exception e ){
            e.printStackTrace();
        }

        layoutContainer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));

    }

    ///==============================================




    //==============================================
    private void showInterstitial() {
        // Show the ad if it's ready.
        if (mInterstitialAd != null ) {
            mInterstitialAd.show(this);
        }
    }
    //============================================


    // loadFullscreenAd method starts here.....
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        loadFullscreenAd();

                        if (playingVideo==true && myYoutubePlayer!=null && !myYoutubePlayer.isPlaying() ){

                            Handler handler = new Handler(Looper.getMainLooper());

                            handler.postDelayed(new Runnable() {
                                @Override
                                public void run() {

                                    myYoutubePlayer.play();
                                    playingVideo = false;

                                }
                            }, 500);

                        }


                    }





                }); // FullScreen Callback Ends here


            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }





        });

    }

    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    ///==============================================
    ///==============================================


    ///==============================================
    ///==============================================










    ///==============================================
    ///==============================================


    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public MyAdapter(){
            this.inflater = (LayoutInflater) MainActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return arrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.video_item, parent, false);

            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            TextView tvDescription = convertView.findViewById(R.id.tvDescription);
            ImageView imgThumb = convertView.findViewById(R.id.imgThumb);
            RelativeLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> hashMap = arrayList.get(position);
            String vdo_id = hashMap.get("vdo_id");
            String vdo_title = hashMap.get("vdo_title");
            String vdo_desciption = hashMap.get("vdo_desciption");

            tvTitle.setText(vdo_title);
            tvDescription.setText(vdo_desciption);

            // Youtube thumnail link is like
            //https://i.ytimg.com/vi/<VIDEO ID>/0.jpg
            String thumb_link = "https://i.ytimg.com/vi/"+vdo_id+"/0.jpg";
            Picasso.get().
                    load(""+thumb_link)
                    .placeholder(R.mipmap.ic_launcher)
                    .into(imgThumb);

            layItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    fabButton.setVisibility(View.GONE);

                    //Play Video
                    PLAYING_NOW = position;
                    playVideo(vdo_id);
                    showInterstitial();

                    /*
                    //Use this code to show ad randomly
                    Random random  = new Random();
                    int myCount = random.nextInt(100-5)+5;
                    if (myCount%2==0){
                        //Show Fullscreen ad
                        showInterstitial();
                    }
                     */





                }
            });




            return convertView;
        }
    }



    //================================================
    private void playVideo(String video_id){

        if(myYoutubePlayer!=null){
            layPlayer.setVisibility(View.VISIBLE);
            layPlayer.startAnimation(AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in));
            myYoutubePlayer.loadVideo(video_id);
            myYoutubePlayer.play();
            playingVideo = true;
        }else{
            Toast.makeText(MainActivity.this, "Please wait...", Toast.LENGTH_LONG).show();
        }
    }
    //================================================
    private void closePlayer(){
        if(myYoutubePlayer!=null && myYoutubePlayer.isPlaying()) myYoutubePlayer.pause();
        layPlayer.setVisibility(View.GONE);
        layPlayer.clearAnimation();
    }







    //==============================================
    private final class MyPlaybackEventListener implements YouTubePlayer.PlaybackEventListener {
        public void onBuffering(boolean arg0) {
            //updateLog("onBuffering(): " + String.valueOf(arg0));
            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.buffer);
                imgPlayPause.setTag("BUFFERING");
            }
        }

        public void onPaused() {
            //updateLog("onPaused()");

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
                imgPlayPause.setTag("PAUSED");
            }

            //Toast.makeText(getApplicationContext(), "Paused", Toast.LENGTH_SHORT).show();
        }

        public void onPlaying() {
            //updateLog("onPlaying()");
            // Toast.makeText(getApplicationContext(), "Paying", Toast.LENGTH_SHORT).show();

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_pause);
                imgPlayPause.setTag("PLAYING");
            }

        }

        public void onSeekTo(int arg0) {
            //updateLog("onSeekTo(): " + String.valueOf(arg0));
        }

        public void onStopped() {

            if (imgPlayPause != null ){
                imgPlayPause.setImageResource(R.drawable.icon_play);
            }

        }

    }

    //*******************************************************************



    //=================================================================




    private final class MyPlayerStateChangeListener implements YouTubePlayer.PlayerStateChangeListener {

        public void onAdStarted() {
            //updateLog("onAdStarted()");
        }

        public void onError(
                com.google.android.youtube.player.YouTubePlayer.ErrorReason arg0) {
            //updateLog("onError(): " + arg0.toString());
            Toast.makeText(getApplicationContext(), ""+arg0.toString(), Toast.LENGTH_SHORT).show();
            //Log.d("loveRana", ""+arg0.ordinal());

            /*
            if (arg0.toString().contains("NOT_PLAYABLE") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }
            else if (arg0.toString().contains("INTERNAL_ERROR") && YOUTUBE_PLAYER ){
                webViewPlayer();
            }

             */



        }

        public void onLoaded(String arg0) {
            //updateLog("onLoaded(): " + arg0);
        }

        public void onLoading() {
            //updateLog("onLoading()");
        }

        public void onVideoEnded() {
            // Toast.makeText(getApplicationContext(), "ended", Toast.LENGTH_LONG).show();
            playNextVideo();


        }


        public void onVideoStarted() {
            //updateLog("onVideoStarted()");
        }

    }
    //==============================================================



//=================================================
    private void playNextVideo(){
        if(PLAYING_NOW >= (arrayList.size()-1))
            PLAYING_NOW = 0;
        else PLAYING_NOW++;

        HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
        String vdo_id = hashMap.get("vdo_id");
        playVideo(vdo_id);
    }


    private void playPreviousVideo(){
        if(PLAYING_NOW > 0){
            PLAYING_NOW--;
            HashMap<String, String> hashMap = arrayList.get(PLAYING_NOW);
            String vdo_id = hashMap.get("vdo_id");
            playVideo(vdo_id);
        }else{
            Toast.makeText(MainActivity.this, "Playing the first video", Toast.LENGTH_LONG).show();
        }

    }






    ///==============================================
    ///==============================================
    //===================================================

    public static void setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.AT_MOST);
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

    //==========================================================================
//==========================================================================





    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        myYoutubePlayer = youTubePlayer;
        myYoutubePlayer.setPlaybackEventListener(myPlaybackEventListener);

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        myYoutubePlayer = null;
    }




    ///====================================================
    private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
    private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

        if (layPlayer.getVisibility()==View.GONE) {

            if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {

                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);

            } else {

                Toast.makeText(getBaseContext(), "Press again to exit",
                        Toast.LENGTH_SHORT).show();
            }

            mBackPressed = System.currentTimeMillis();

        } else{
            closePlayer();
        }


    } // end of onBackpressed method

    //#############################################################################################

    protected boolean isAppInstalled(String packageName) {
        Intent mIntent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (mIntent != null) {
            return true;
        }
        else {
            return false;
        }
    }

    //=======================================================
    //method to show a dialog in android
    private void showYoutubeInsallDialog(){
        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Install Youtube App");
        alertDialog.setMessage(getString(R.string.app_name)+" will not work if you don't have youtube official app installed on your device");
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Install NOW",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dialog.dismiss();
                        openStoreIntent("com.google.android.youtube");
                    }
                });

        alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Exit App",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Exit App
                        if(Build.VERSION.SDK_INT>=16 && Build.VERSION.SDK_INT<21){
                            finishAffinity();
                        } else if(Build.VERSION.SDK_INT>=21){
                            finishAndRemoveTask();
                        }

                    }
                });

        alertDialog.setCancelable(false);
        alertDialog.show();
    }

    //===============================================================



    //=================================================
    ///==============================================
    ///==============================================
    ///==============================================
    //try to download youtube app from app stores
    private void openStoreIntent(String app_package){
        String url="";
        Intent storeintent=null;
        try {
            url = "market://details?id="+app_package;
            storeintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            storeintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
            startActivity(storeintent);
        } catch ( final Exception e ) {
            url = "https://play.google.com/store/apps/details?id="+app_package;
            storeintent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            storeintent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_RESET_TASK_IF_NEEDED);
            startActivity(storeintent);
        }

    }
    ///==============================================
    ///==============================================
    ///==============================================
    ///==============================================








}