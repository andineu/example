import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Bug {
	/**
	 * Find the minimum in the referenced array.
	 * @param a Array of int values
	 * @return smallest value on the array
	 * @throws IllegalArgumentException if referenced array is null or empty
	 */
	public static int minimum(int[] a) throws IllegalArgumentException {
		int m = Integer.MAX_VALUE;

		if (a == null || a.length == 0) {
            throw new IllegalArgumentException();
        }

		for (int i = 0; i < a.length; i++) {
			if (a[i] < m) {
				m = a[i];
			}
		}

		return m;
	}
}