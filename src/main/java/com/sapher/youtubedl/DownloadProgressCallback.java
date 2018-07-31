package com.sapher.youtubedl;

import java.sql.SQLException;

public interface DownloadProgressCallback {
    void onProgressUpdate(float progress, long etaInSeconds);
}
