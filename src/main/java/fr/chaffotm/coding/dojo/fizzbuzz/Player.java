/**
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
package fr.chaffotm.coding.dojo.fizzbuzz;

/**
 * @author Matthieu CHAFFOTTE
 */
public class Player {

    public String say(int number) {
        String response;
        if (number % 3 == 0) {
            response = "Fizz";
        } else if (number % 5 == 0) {
            response = "Buzz";
        } else {
            response = String.valueOf(number);
        }
        return response;
    }

}
