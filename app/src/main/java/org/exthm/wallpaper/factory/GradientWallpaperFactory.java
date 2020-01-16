/*
 * Copyright (C) 2019 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.exthm.wallpaper.factory;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

import org.exthm.wallpaper.bundle.WallpaperBundle;
import org.exthm.wallpaper.bundle.WallpaperType;

public final class GradientWallpaperFactory {

    private GradientWallpaperFactory() {
    }

    public static WallpaperBundle build(@NonNull final String name,
                                        @NonNull final Resources res,
                                        @DrawableRes final int drawableRes) {
        Drawable drawable = res.getDrawable(drawableRes, res.newTheme());
        return new WallpaperBundle(name, drawable, drawableRes, WallpaperType.GRADIENT);
    }
}
