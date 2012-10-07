/*
 * Copyright (C) 2012 Pavel Fatin <http://pavelfatin.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.pavelfatin.fractal.picture;

import java.awt.*;

public class DrawUpdate implements Update {
    private final Image myImage;
    private final Point myLocation;

    public DrawUpdate(final Image image, final Point location) {
        myImage = image;
        myLocation = location;
    }

    public void apply(final Graphics graphics) {
        graphics.drawImage(myImage, myLocation.x, myLocation.y, null);
    }
}
