package org.tensorflow.demo.model;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by yadwinderpalsingh on 2017-06-24.
 */

public class AppManager {
    private static Activity _activity;

    public static void setActivity(Activity actiity) {
        _activity = actiity;
    }

    public static Activity getActivity() {
        return _activity;
    }

    public static Application getApplication() {
        return _activity.getApplication();
    }

    public static Context getContext() {
        return _activity.getApplicationContext();
    }

    public static Resources getResources() {
        return _activity.getResources();
    }

    private static Boolean _isGameStart = false;

    public static Boolean getGameStart() {
        return _isGameStart;
    }

    public static void setGameStart(Boolean state) {
        _isGameStart = state;
    }

    private static Boolean _isSinglePlayer = false;

    public static Boolean getSinglePlayer() {
        return _isSinglePlayer;
    }

    public static void setSinglePlayer(Boolean state) {
        _isSinglePlayer = state;
    }

    private static Boolean _isMultiPlayer = false;

    public static Boolean getMultiPlayer() {
        return _isMultiPlayer;
    }

    public static void setMultiPlayer(Boolean state) {
        _isMultiPlayer = state;
    }

    private static Integer _noOfPlayers = 0;

    public static Integer getNoOfPlayers() {
        return _noOfPlayers;
    }

    public static void setNoOfPlayersr(Integer players) {
        _noOfPlayers = players;
    }

    private static ArrayList<Player> _playerList = new ArrayList<>();

    public static ArrayList<Player> getPlayerList() {
        return _playerList;
    }

    public static void setPlayerList(ArrayList<Player> players) {
        _playerList = players;
    }

    public static void appendPlayer(ArrayList<Player> players) {
        for (Player player : players) {
            _playerList.add(player);
        }
    }

    public static void appendPlayer(Player player) {
        _playerList.add(player);
    }

    public static void clearPlayers() {
        if (_playerList != null) {
            _playerList.clear();
        }
    }



    // reset Game
    public static void resetGame(){
        _isGameStart = false;
        _isSinglePlayer = false;
        _isMultiPlayer = false;
    }

}
