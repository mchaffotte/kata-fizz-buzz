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

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Matthieu CHAFFOTTE
 */
public class PlayerTest {

    @Test
    public void say_should_answer_one_with_one() throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(1);

        //Then
        assertThat(response).isEqualTo("1");
    }

    @Test
    public void say_should_answer_two_with_two() throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(2);

        //Then
        assertThat(response).isEqualTo("2");
    }

    @Test
    public void say_should_answer_fizz_with_three() throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(3);

        //Then
        assertThat(response).isEqualTo("Fizz");
    }

    @Test
    public void say_should_answer_fizz_if_the_number_is_divisible_by_three() throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(6);

        //Then
        assertThat(response).isEqualTo("Fizz");
    }

    @Test
    public void say_should_answer_buzz_with_five() throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(5);

        //Then
        assertThat(response).isEqualTo("Buzz");
    }

    @Test
    public void say_should_answer_buzz_if_the_number_is_divisible_by_five() throws Exception {
        //Given
        Player player = new Player();

        //When
        String response = player.say(20);

        //Then
        assertThat(response).isEqualTo("Buzz");
    }

}
