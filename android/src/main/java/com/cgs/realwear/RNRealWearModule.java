
package com.cgs.realwear;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class RNRealWearModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  // Update help commands intent action
  private static final String ACTION_UPDATE_HELP =
          "com.realwear.wearhf.intent.action.UPDATE_HELP_COMMANDS";

  //
  // Identifiers for adding commands to the Show Help screen
  //
  private static final String EXTRA_TEXT = "com.realwear.wearhf.intent.extra.HELP_COMMANDS";
  private static final String EXTRA_SOURCE = "com.realwear.wearhf.intent.extra.SOURCE_PACKAGE";

  public RNRealWearModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNRealWear";
  }

  @ReactMethod
  public void addHelpCommands(final ReadableArray array) {
    ArrayList<String> commands = new ArrayList<>();

    for (Object command : array.toArrayList()) {
      commands.add(command.toString());
    }

    final Intent intent = new Intent(ACTION_UPDATE_HELP);
    intent.putStringArrayListExtra(EXTRA_TEXT, commands);
    intent.putExtra(EXTRA_SOURCE, reactContext.getPackageName());
    reactContext.sendBroadcast(intent);
  }
}