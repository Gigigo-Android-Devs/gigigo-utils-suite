/*
 * Created by Gigigo Android Team
 *
 * Copyright (C) 2016 Gigigo Mobile Services SL
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.gigigo.ggglib.permissions;

import com.gigigo.ggglib.ContextProvider;
import com.gigigo.ggglib.R;

public class ContinueRequestPermissionListenerImpl extends AbstractPermissionListener{

  public ContinueRequestPermissionListenerImpl(ContextProvider contextProvider) {
    super(contextProvider);
  }

  @Override public int getPermissionDeniedFeedback() {
    return R.string.continueRequestPermissionDeniedFeedback;
  }

  @Override public int getPermissionRationaleMessage() {
    return R.string.continueRequestPermissionRationaleMessage;
  }

  @Override public int getPermissionRationaleTitle() {
    return R.string.continueRequestPermissionRationaleTitle;
  }
}
