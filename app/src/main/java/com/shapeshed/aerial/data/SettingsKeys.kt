package com.shapeshed.aerial.data

import androidx.datastore.preferences.core.booleanPreferencesKey

/** Whether the mini player shows the stream's current bitrate. */
val SHOW_STREAM_BITRATE_KEY = booleanPreferencesKey("show_stream_bitrate")

/** Whether the home tab is shown, or only favourites. */
val SHOW_HOME_KEY = booleanPreferencesKey("show_home")

/** Whether the last played station starts playing automatically when the app opens. */
val AUTO_PLAY_LAST_STATION_KEY = booleanPreferencesKey("auto_play_last_station")
