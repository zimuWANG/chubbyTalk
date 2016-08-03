package com.example.alab.myapplication;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;

/**
 * Created by ee4095 on 8/3/2016.
 */
public class SoundPlayer {
    private static MediaPlayer mp = null;

    public static void playSound(int btnId, Context context) {
        stopPlaying();

        switch (btnId) {

            case R.id.btn_cn_0:
                mp = MediaPlayer.create(context, R.raw.cn_0);
                break;
            case R.id.btn_k_0:
                mp = MediaPlayer.create(context, R.raw.k_0);
                break;
            case R.id.btn_hk_0:
                mp = MediaPlayer.create(context, R.raw.hk_0);
                break;
            case R.id.btn_tw_0:
                mp = MediaPlayer.create(context, R.raw.tw_0);
                break;
            case R.id.btn_cz_0:
                mp = MediaPlayer.create(context, R.raw.cz_0);
                break;
//            case R.id.btn_cn_1:
//                mp = MediaPlayer.create(context, R.raw.cn_1);
//                break;
//            case R.id.btn_k_1:
//                mp = MediaPlayer.create(context, R.raw.k_1);
//                break;
//            case R.id.btn_hk_1:
//                mp = MediaPlayer.create(context, R.raw.hk_1);
//                break;
//            case R.id.btn_tw_1:
//                mp = MediaPlayer.create(context, R.raw.tw_1);
//                break;
//            case R.id.btn_cz_1:
//                mp = MediaPlayer.create(context, R.raw.cz_1);
//                break;
//            case R.id.btn_cn_2:
//                mp = MediaPlayer.create(context, R.raw.cn_2);
//                break;
//            case R.id.btn_k_2:
//                mp = MediaPlayer.create(context, R.raw.k_2);
//                break;
//            case R.id.btn_hk_2:
//                mp = MediaPlayer.create(context, R.raw.hk_2);
//                break;
//            case R.id.btn_tw_2:
//                mp = MediaPlayer.create(context, R.raw.tw_2);
//                break;
//            case R.id.btn_cz_2:
//                mp = MediaPlayer.create(context, R.raw.cz_2);
//                break;
//            case R.id.btn_cn_3:
//                mp = MediaPlayer.create(context, R.raw.cn_3);
//                break;
//            case R.id.btn_k_3:
//                mp = MediaPlayer.create(context, R.raw.k_3);
//                break;
//            case R.id.btn_hk_3:
//                mp = MediaPlayer.create(context, R.raw.hk_3);
//                break;
//            case R.id.btn_tw_3:
//                mp = MediaPlayer.create(context, R.raw.tw_3);
//                break;
//            case R.id.btn_cz_3:
//                mp = MediaPlayer.create(context, R.raw.cz_3);
//                break;
//            case R.id.btn_cn_4:
//                mp = MediaPlayer.create(context, R.raw.cn_4);
//                break;
//            case R.id.btn_k_4:
//                mp = MediaPlayer.create(context, R.raw.k_4);
//                break;
//            case R.id.btn_hk_4:
//                mp = MediaPlayer.create(context, R.raw.hk_4);
//                break;
//            case R.id.btn_tw_4:
//                mp = MediaPlayer.create(context, R.raw.tw_4);
//                break;
//            case R.id.btn_cz_4:
//                mp = MediaPlayer.create(context, R.raw.cz_4);
//                break;
//            case R.id.btn_cn_5:
//                mp = MediaPlayer.create(context, R.raw.cn_5);
//                break;
//            case R.id.btn_k_5:
//                mp = MediaPlayer.create(context, R.raw.k_5);
//                break;
//            case R.id.btn_hk_5:
//                mp = MediaPlayer.create(context, R.raw.hk_5);
//                break;
//            case R.id.btn_tw_5:
//                mp = MediaPlayer.create(context, R.raw.tw_5);
//                break;
//            case R.id.btn_cz_5:
//                mp = MediaPlayer.create(context, R.raw.cz_5);
//                break;
//            case R.id.btn_cn_6:
//                mp = MediaPlayer.create(context, R.raw.cn_6);
//                break;
//            case R.id.btn_k_6:
//                mp = MediaPlayer.create(context, R.raw.k_6);
//                break;
//            case R.id.btn_hk_6:
//                mp = MediaPlayer.create(context, R.raw.hk_6);
//                break;
//            case R.id.btn_tw_6:
//                mp = MediaPlayer.create(context, R.raw.tw_6);
//                break;
//            case R.id.btn_cz_6:
//                mp = MediaPlayer.create(context, R.raw.cz_6);
//                break;
//            case R.id.btn_cn_7:
//                mp = MediaPlayer.create(context, R.raw.cn_7);
//                break;
//            case R.id.btn_k_7:
//                mp = MediaPlayer.create(context, R.raw.k_7);
//                break;
//            case R.id.btn_hk_7:
//                mp = MediaPlayer.create(context, R.raw.hk_7);
//                break;
//            case R.id.btn_tw_7:
//                mp = MediaPlayer.create(context, R.raw.tw_7);
//                break;
//            case R.id.btn_cz_7:
//                mp = MediaPlayer.create(context, R.raw.cz_7);
//                break;
//            case R.id.btn_cn_8:
//                mp = MediaPlayer.create(context, R.raw.cn_8);
//                break;
//            case R.id.btn_k_8:
//                mp = MediaPlayer.create(context, R.raw.k_8);
//                break;
//            case R.id.btn_hk_8:
//                mp = MediaPlayer.create(context, R.raw.hk_8);
//                break;
//            case R.id.btn_tw_8:
//                mp = MediaPlayer.create(context, R.raw.tw_8);
//                break;
//            case R.id.btn_cz_8:
//                mp = MediaPlayer.create(context, R.raw.cz_8);
//                break;
//            case R.id.btn_cn_9:
//                mp = MediaPlayer.create(context, R.raw.cn_9);
//                break;
//            case R.id.btn_k_9:
//                mp = MediaPlayer.create(context, R.raw.k_9);
//                break;
//            case R.id.btn_hk_9:
//                mp = MediaPlayer.create(context, R.raw.hk_9);
//                break;
//            case R.id.btn_tw_9:
//                mp = MediaPlayer.create(context, R.raw.tw_9);
//                break;
//            case R.id.btn_cz_9:
//                mp = MediaPlayer.create(context, R.raw.cz_9);
//                break;
//            case R.id.btn_cn_10:
//                mp = MediaPlayer.create(context, R.raw.cn_10);
//                break;
//            case R.id.btn_k_10:
//                mp = MediaPlayer.create(context, R.raw.k_10);
//                break;
//            case R.id.btn_hk_10:
//                mp = MediaPlayer.create(context, R.raw.hk_10);
//                break;
//            case R.id.btn_tw_10:
//                mp = MediaPlayer.create(context, R.raw.tw_10);
//                break;
//            case R.id.btn_cz_10:
//                mp = MediaPlayer.create(context, R.raw.cz_10);
//                break;
//            case R.id.btn_cn_11:
//                mp = MediaPlayer.create(context, R.raw.cn_11);
//                break;
//            case R.id.btn_k_11:
//                mp = MediaPlayer.create(context, R.raw.k_11);
//                break;
//            case R.id.btn_hk_11:
//                mp = MediaPlayer.create(context, R.raw.hk_11);
//                break;
//            case R.id.btn_tw_11:
//                mp = MediaPlayer.create(context, R.raw.tw_11);
//                break;
//            case R.id.btn_cz_11:
//                mp = MediaPlayer.create(context, R.raw.cz_11);
//                break;
//            case R.id.btn_cn_12:
//                mp = MediaPlayer.create(context, R.raw.cn_12);
//                break;
//            case R.id.btn_k_12:
//                mp = MediaPlayer.create(context, R.raw.k_12);
//                break;
//            case R.id.btn_hk_12:
//                mp = MediaPlayer.create(context, R.raw.hk_12);
//                break;
//            case R.id.btn_tw_12:
//                mp = MediaPlayer.create(context, R.raw.tw_12);
//                break;
//            case R.id.btn_cz_12:
//                mp = MediaPlayer.create(context, R.raw.cz_12);
//                break;
//            case R.id.btn_cn_13:
//                mp = MediaPlayer.create(context, R.raw.cn_13);
//                break;
//            case R.id.btn_k_13:
//                mp = MediaPlayer.create(context, R.raw.k_13);
//                break;
//            case R.id.btn_hk_13:
//                mp = MediaPlayer.create(context, R.raw.hk_13);
//                break;
//            case R.id.btn_tw_13:
//                mp = MediaPlayer.create(context, R.raw.tw_13);
//                break;
//            case R.id.btn_cz_13:
//                mp = MediaPlayer.create(context, R.raw.cz_13);
//                break;
//            case R.id.btn_cn_13:
//                mp = MediaPlayer.create(context, R.raw.cn_13);
//                break;
//            case R.id.btn_k_13:
//                mp = MediaPlayer.create(context, R.raw.k_13);
//                break;
//            case R.id.btn_hk_13:
//                mp = MediaPlayer.create(context, R.raw.hk_13);
//                break;
//            case R.id.btn_tw_13:
//                mp = MediaPlayer.create(context, R.raw.tw_13);
//                break;
//            case R.id.btn_cz_13:
//                mp = MediaPlayer.create(context, R.raw.cz_13);
//                break;
//            case R.id.btn_cn_13:
//                mp = MediaPlayer.create(context, R.raw.cn_13);
//                break;
//            case R.id.btn_k_13:
//                mp = MediaPlayer.create(context, R.raw.k_13);
//                break;
//            case R.id.btn_hk_13:
//                mp = MediaPlayer.create(context, R.raw.hk_13);
//                break;
//            case R.id.btn_tw_13:
//                mp = MediaPlayer.create(context, R.raw.tw_13);
//                break;
//            case R.id.btn_cz_13:
//                mp = MediaPlayer.create(context, R.raw.cz_13);
//                break;
//            case R.id.btn_cn_14:
//                mp = MediaPlayer.create(context, R.raw.cn_14);
//                break;
//            case R.id.btn_k_14:
//                mp = MediaPlayer.create(context, R.raw.k_14);
//                break;
//            case R.id.btn_hk_14:
//                mp = MediaPlayer.create(context, R.raw.hk_14);
//                break;
//            case R.id.btn_tw_14:
//                mp = MediaPlayer.create(context, R.raw.tw_14);
//                break;
//            case R.id.btn_cz_14:
//                mp = MediaPlayer.create(context, R.raw.cz_14);
//                break;
//            case R.id.btn_cn_15:
//                mp = MediaPlayer.create(context, R.raw.cn_15);
//                break;
//            case R.id.btn_k_15:
//                mp = MediaPlayer.create(context, R.raw.k_15);
//                break;
//            case R.id.btn_hk_15:
//                mp = MediaPlayer.create(context, R.raw.hk_15);
//                break;
//            case R.id.btn_tw_15:
//                mp = MediaPlayer.create(context, R.raw.tw_15);
//                break;
//            case R.id.btn_cz_15:
//                mp = MediaPlayer.create(context, R.raw.cz_15);
//                break;
//            case R.id.btn_cn_16:
//                mp = MediaPlayer.create(context, R.raw.cn_16);
//                break;
//            case R.id.btn_k_16:
//                mp = MediaPlayer.create(context, R.raw.k_16);
//                break;
//            case R.id.btn_hk_16:
//                mp = MediaPlayer.create(context, R.raw.hk_16);
//                break;
//            case R.id.btn_tw_16:
//                mp = MediaPlayer.create(context, R.raw.tw_16);
//                break;
//            case R.id.btn_cz_16:
//                mp = MediaPlayer.create(context, R.raw.cz_16);
//                break;
//            case R.id.btn_cn_17:
//                mp = MediaPlayer.create(context, R.raw.cn_17);
//                break;
//            case R.id.btn_k_17:
//                mp = MediaPlayer.create(context, R.raw.k_17);
//                break;
//            case R.id.btn_hk_17:
//                mp = MediaPlayer.create(context, R.raw.hk_17);
//                break;
//            case R.id.btn_tw_17:
//                mp = MediaPlayer.create(context, R.raw.tw_17);
//                break;
//            case R.id.btn_cz_17:
//                mp = MediaPlayer.create(context, R.raw.cz_17);
//                break;
//            case R.id.btn_cn_18:
//                mp = MediaPlayer.create(context, R.raw.cn_18);
//                break;
//            case R.id.btn_k_18:
//                mp = MediaPlayer.create(context, R.raw.k_18);
//                break;
//            case R.id.btn_hk_18:
//                mp = MediaPlayer.create(context, R.raw.hk_18);
//                break;
//            case R.id.btn_tw_18:
//                mp = MediaPlayer.create(context, R.raw.tw_18);
//                break;
//            case R.id.btn_cz_18:
//                mp = MediaPlayer.create(context, R.raw.cz_18);
//                break;
//            case R.id.btn_cn_19:
//                mp = MediaPlayer.create(context, R.raw.cn_19);
//                break;
//            case R.id.btn_k_19:
//                mp = MediaPlayer.create(context, R.raw.k_19);
//                break;
//            case R.id.btn_hk_19:
//                mp = MediaPlayer.create(context, R.raw.hk_19);
//                break;
//            case R.id.btn_tw_19:
//                mp = MediaPlayer.create(context, R.raw.tw_19);
//                break;
//            case R.id.btn_cz_19:
//                mp = MediaPlayer.create(context, R.raw.cz_19);
//                break;
//            case R.id.btn_cn_20:
//                mp = MediaPlayer.create(context, R.raw.cn_20);
//                break;
//            case R.id.btn_k_20:
//                mp = MediaPlayer.create(context, R.raw.k_20);
//                break;
//            case R.id.btn_hk_20:
//                mp = MediaPlayer.create(context, R.raw.hk_20);
//                break;
//            case R.id.btn_tw_20:
//                mp = MediaPlayer.create(context, R.raw.tw_20);
//                break;
//            case R.id.btn_cz_20:
//                mp = MediaPlayer.create(context, R.raw.cz_20);
//                break;
//            case R.id.btn_cn_21:
//                mp = MediaPlayer.create(context, R.raw.cn_21);
//                break;
//            case R.id.btn_k_21:
//                mp = MediaPlayer.create(context, R.raw.k_21);
//                break;
//            case R.id.btn_hk_21:
//                mp = MediaPlayer.create(context, R.raw.hk_21);
//                break;
//            case R.id.btn_tw_21:
//                mp = MediaPlayer.create(context, R.raw.tw_21);
//                break;
//            case R.id.btn_cz_21:
//                mp = MediaPlayer.create(context, R.raw.cz_21);
//                break;
//            case R.id.btn_cn_22:
//                mp = MediaPlayer.create(context, R.raw.cn_22);
//                break;
//            case R.id.btn_k_22:
//                mp = MediaPlayer.create(context, R.raw.k_22);
//                break;
//            case R.id.btn_hk_22:
//                mp = MediaPlayer.create(context, R.raw.hk_22);
//                break;
//            case R.id.btn_tw_22:
//                mp = MediaPlayer.create(context, R.raw.tw_22);
//                break;
//            case R.id.btn_cz_22:
//                mp = MediaPlayer.create(context, R.raw.cz_22);
//                break;
//            case R.id.btn_cn_23:
//                mp = MediaPlayer.create(context, R.raw.cn_23);
//                break;
//            case R.id.btn_k_23:
//                mp = MediaPlayer.create(context, R.raw.k_23);
//                break;
//            case R.id.btn_hk_23:
//                mp = MediaPlayer.create(context, R.raw.hk_23);
//                break;
//            case R.id.btn_tw_23:
//                mp = MediaPlayer.create(context, R.raw.tw_23);
//                break;
//            case R.id.btn_cz_23:
//                mp = MediaPlayer.create(context, R.raw.cz_23);
//                break;
//            case R.id.btn_cn_24:
//                mp = MediaPlayer.create(context, R.raw.cn_24);
//                break;
//            case R.id.btn_k_24:
//                mp = MediaPlayer.create(context, R.raw.k_24);
//                break;
//            case R.id.btn_hk_24:
//                mp = MediaPlayer.create(context, R.raw.hk_24);
//                break;
//            case R.id.btn_tw_24:
//                mp = MediaPlayer.create(context, R.raw.tw_24);
//                break;
//            case R.id.btn_cz_24:
//                mp = MediaPlayer.create(context, R.raw.cz_24);
//                break;
        }
        mp.start();
    }

    private static void stopPlaying(){
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
