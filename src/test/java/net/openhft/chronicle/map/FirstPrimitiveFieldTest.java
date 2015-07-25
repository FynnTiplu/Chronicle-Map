/*
 *      Copyright (C) 2015  higherfrequencytrading.com
 *
 *      This program is free software: you can redistribute it and/or modify
 *      it under the terms of the GNU Lesser General Public License as published by
 *      the Free Software Foundation, either version 3 of the License.
 *
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU Lesser General Public License for more details.
 *
 *      You should have received a copy of the GNU Lesser General Public License
 *      along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.openhft.chronicle.map;

import net.openhft.chronicle.map.fromdocs.BondVOInterface;
import net.openhft.lang.model.DataValueGenerator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItem;

public class FirstPrimitiveFieldTest {
    @Test
    public void firstPrimitiveFieldTest() {
        Assert.assertThat(Arrays.<Class>asList(long.class, double.class),
                hasItem(DataValueGenerator.firstPrimitiveFieldType(BondVOInterface.class)));
    }
}
