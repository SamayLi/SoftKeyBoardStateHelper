package com.samay.softkeyboardstatehelper;

/**
 * Created by samay on 2017/9/26.
 */

public interface SoftKeyBoardStateListener {
    void onSoftKeyBoardOpened(int keyboardHeightInpx);
    void onSoftKeyBoardClosed();
}
