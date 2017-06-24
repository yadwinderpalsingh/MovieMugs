package org.tensorflow.demo.model;

/**
 * Created by yadwinderpalsingh on 2017-06-24.
 */

public class Player {
    private String _playerId;

    public void setPlayerId(String id){
        _playerId = id;
    }

    public String getPlayerId(){ return _playerId; }

    private String _playerName;

    public void setPlayerName(String name){
        _playerName = name;
    }

    public String getPlayerName(){ return _playerName; }

    private Integer _playerScore = 0;

    public void setPlayerScore(Integer score){
        _playerScore += score;
    }

    public Integer getPlayerScore(){ return _playerScore; }

    private String _videoSource;

    public void setVideoSource(String source){
        _videoSource = source;
    }

    public String getVideoSource(){ return _videoSource; }

    public Player(Player player){
        this._playerId = player.getPlayerId();
        this._playerName = player.getPlayerName();
        this._playerScore = player.getPlayerScore();
        this._videoSource = player.getVideoSource();
    }

}
