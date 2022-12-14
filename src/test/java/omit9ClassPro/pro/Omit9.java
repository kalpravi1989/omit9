package omit9ClassPro.pro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Omit9 {
	private List<Integer> getLastnumber(List<Integer> list) {
		List<Integer> lastdig = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 0) {
				lastdig.add(list.get(i));
			} else {

				lastdig.add(list.get(i) % 10);
			}
		}
		return lastdig;
	}

	private List<Integer> omit9(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == 9) {
				list.remove(i);
				i--;

			}
		}
		return list;
	}

	@Test
	public void test1() {
		List<Integer> list = Arrays.asList(12, 41, 19);
		List<Integer> lastdigit = getLastnumber(list);
		System.out.println(lastdigit);
		List<Integer> ans = omit9(lastdigit);
		System.out.println(ans);
		List<Integer> exp = Arrays.asList(2, 1);
		for (int i = 0; i < ans.size(); i++) {

			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}

	@Test
	public void test2() {
		List<Integer> list = Arrays.asList(99, 49, 19);
		List<Integer> lastdigit = getLastnumber(list);
		System.out.println(lastdigit);
		List<Integer> ans = omit9(lastdigit);
		System.out.println(ans);
		List<Integer> exp = Arrays.asList();
		for (int i = 0; i < ans.size(); i++) {

			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}

	@Test
	public void test3() {
		List<Integer> list = Arrays.asList(0, 0, 0);
		List<Integer> lastdigit = getLastnumber(list);
		System.out.println(lastdigit);
		List<Integer> ans = omit9(lastdigit);
		System.out.println(ans);
		List<Integer> exp = Arrays.asList(0, 0, 0);
		for (int i = 0; i < ans.size(); i++) {

			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}

	@Test
	public void test4() {
		List<Integer> list = Arrays.asList(1, 2, 3);
		List<Integer> lastdigit = getLastnumber(list);
		System.out.println(lastdigit);
		List<Integer> ans = omit9(lastdigit);
		System.out.println(ans);
		List<Integer> exp = Arrays.asList(1, 2, 3);
		for (int i = 0; i < ans.size(); i++) {

			Assert.assertEquals(ans.get(i), exp.get(i));
		}
	}
}
