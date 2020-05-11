import java.util.ArrayList;
import java.util.List;

public class Grade_Rounding {

	public static void main(String[] args) {

		int[] arr = { 73, 67, 38, 33 };

		List<Integer> grades = new ArrayList<>(arr.length);
		{
			for (int i : arr) {
				grades.add(Integer.valueOf(i));
			}
		}

		List<Integer> result = gradingStudents(grades);
		result.forEach(System.out::println);
//		System.out.println(result);
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		for (int i = 0; i <= grades.size() - 1; i++) {
			int tempMod = grades.get(i) % 5;
			System.out.println("DEBUG - WHAT IS GRADE [" + grades.get(i) + "] tempMOD  [" + tempMod + "]");
			if (grades.get(i) >= 38 && grades.get(i) % 5 > 2) {
				int temp = grades.get(i) + (5 - (grades.get(i) % 5));
				System.out.println("DEBUG - SETTING GRADE [" + temp + "]");
				grades.set(i, grades.get(i) + (5 - (grades.get(i) % 5)));
			} else {
				System.out.println("DEBUG - NOT CHANGING GRADE [" + grades.get(i) + "]");
			}
		}
		return grades;
	}

}
