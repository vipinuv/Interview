public class VisibleNode
{

	public int solution(Tree T) {
		// write your code in Java SE 8
		return treeVisible(T, Integer.MIN_VALUE);
	}
	public int treeVisible(Tree T, int maxValue) {
		if(T == null) {
			return 0;
		}

		int num = 0;

		if(T.x >= maxValue) {
			num = 1;
			maxValue = T.x;
		}

		return num + treeVisible(T.l, maxValue) + treeVisible(T.r, maxValue);
	}
}
