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

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Matthieu CHAFFOTTE
 */
@RunWith(JUnitParamsRunner.class)
public class PlayerGameTest {

    @Test
    @Parameters(
            {"1, 1",  "2, 2", "3, Fizz",  "4, 4", "5, Buzz",  "6, Fizz", "7, 7", "8, 8", "9, Fizz",
            "10, Buzz",  "11, 11", "12, Fizz",  "13, 13", "14, 14",  "15, FizzBuzz", "16, 16", "17, 17", "18, Fizz", "19, 19",
            "20, Buzz",  "21, Fizz", "22, 22",  "23, 23", "24, Fizz",  "25, Buzz", "26, 26", "27, Fizz", "28, 28", "29, 29",
            "30, FizzBuzz"})
    public void say_should_answer_the_right_answer(int number, String answer) throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(number);

        //Then
        assertThat(response).isEqualTo(answer);
    }

}
