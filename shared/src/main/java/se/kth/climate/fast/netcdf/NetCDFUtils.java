/*
 * Copyright (C) 2016 KTH Royal Institute of Technology
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package se.kth.climate.fast.netcdf;

import java.util.List;
import ucar.nc2.Dimension;

/**
 *
 * @author lkroll
 */
public abstract class NetCDFUtils {

    public static boolean isConstant(List<Dimension> dims) {
        if (dims.isEmpty()) {
            return true;
        }
        if (dims.size() == 1) {
            Dimension d = dims.get(0);
            return d.getLength() == 1;
        }
        return false;
    }
}
