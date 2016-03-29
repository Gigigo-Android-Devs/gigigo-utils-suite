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


public class GenericPermissionListenerImpl extends AbstractPermissionListener{

  private final Permission permission;

  public GenericPermissionListenerImpl(Permission permission,
      UserPermissionRequestResponseListener userPermissionRequestResponseListener,
      ContextProvider contextProvider) {
    super(userPermissionRequestResponseListener, contextProvider);
    this.permission = permission;
  }

  @Override public int getPermissionDeniedFeedback() {
    return permission.getPermissionDeniedFeedback();
  }

  @Override public int getPermissionRationaleMessage() {
    return permission.getPermissionRationaleMessage();
  }

  @Override public int getPermissionRationaleTitle() {
    return permission.getPermissionRationaleTitle();
  }
}

