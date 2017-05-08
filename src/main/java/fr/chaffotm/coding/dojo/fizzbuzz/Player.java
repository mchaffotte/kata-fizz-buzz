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
        final StringBuilder builder = new StringBuilder();
        if (isFizz(number)) {
            builder.append("Fizz");
        }
        if (isBuzz(number)) {
            builder.append("Buzz");
        }
        //Neither Fizz nor Buzz
        if (builder.length() == 0){
            builder.append(number);
        }
        return builder.toString();
    }

    private boolean isFizz(int number) {
        return isDivisibleBy(number, 3);
    }

    private boolean isBuzz(int number) {
        return isDivisibleBy(number, 5);
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

}
