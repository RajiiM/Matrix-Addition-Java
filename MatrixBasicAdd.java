public class MatrixBasicAdd {

public static void main(String[] args) {
	int firstMatrix[][] = { {1,2,3},{5,6,7},{15,6,7}};
	int secondMatrix[][]= { {9,10,11},{13,14,15},{5,6,17} };
	int sum[][] = new int[3][3];
	int row;
	int column;

//Addition
	for(row=0;row<sum.length;row++)
	{
	for(column=0;column<sum.length;column++)
	{	        
    sum[row][column] = firstMatrix[row][column] + secondMatrix[row][column];
	}
	}

//Display
	for(row=0;row<sum.length;row++)
	{
	for(column=0;column<sum.length;column++)
	{
	System.out.print(sum[row][column] + "\t" );
	}
	System.out.println();
	}
}
}

//OUTPUT
10 12 14
18 20 22
20 12 24