// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TicTacToe
{
	//(.charAt)
	//Instances Fields 
	private char[][] mat;

	//Defualt Constructer: assigns defualt values
	public TicTacToe()
	{
		char[][] mat = new char[3][3];

	}

	//Modified Constructer: assigns values to all Instance variables,
	//And Instantiates ALL objects.
	public TicTacToe(String game)
	{
		mat = game;
	}

	//Accesser Method: returns the value of a private variable.
	public String getWinner()
	{
		//Horizontal Winner-C.M.O
		for(int col = 0; col < mat[0].length; col++)
		{
			for(int row = 0; row < mat.length; row++)
			{
				if((mat.charAt([col]) == 'X') && (mat.charAt([col + 1]) == 'X') && (mat.charAt([col + 2]) == 'X'))
					return "X wins horizontally!";
				else
					return "O wins horizantally!";
			}
		}

		//Vertical Winner-R.M.O
		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[0].length; col++)
			{
				if((mat.charAt([row]) == 'X') && (mat.charAt([row + 1]) == 'X') && (mat.charAt([row + 2]) == 'X'))
					return "X wins vertically!";
				else
					return "O wins vertically!";
			}
		}

		//Diagonal Winner, down right
		if(mat[0][0].equals(mat[1][1]) && mat[1][1].equals(mat[2][2]) && !mat[0][0].equal(" "))
			if(mat[1][1].equlas("X"))
				return "X wins diagonally!";
			else
				return "O wins diagnally!";

		//Diagonal Winner, down left
		if(mat[0][2].equals(mat[1][1]) && mat[1][1].equals(mat[2][0]) && !mat[0][2].equal(" "))
			if(mat[1][1].equlas("X"))
				return "X wins diagonally!";
			else
				return "O wins diagnally!";

		return "" + "Cat's Game - No Winner!";
	}
	/*
		Original Code

		//Horizontal Winner-C.M.O
		for(int col = 0; col < mat[0].length; col++)
		{
			for(int row = 0; row < mat.length; row++)
			{
				if((mat.charAt([col]) == 'X') && (mat.charAt([col + 1]) == 'X') && (mat.charAt([col + 2]) == 'X'))
					return "X wins horizontally!";
				else if((mat.charAt([col]) == 'O') && (mat.charAt([col + 1]) == 'O') && (mat.charAt([col + 2]) == 'O'))
					return "O wins horizantally!";
				else
					return "Cat's Games - No Winners!";
			}
		}

		//Vertical Winner-R.M.O
		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[0].length; col++)
			{
				if((mat.charAt([row]) == 'X') && (mat.charAt([row + 1]) == 'X') && (mat.charAt([row + 2]) == 'X'))
					return "X wins vertically!";
				else if((mat.charAt([row]) == 'O') && (mat.charAt([row + 1]) == 'O') && (mat.charAt([row + 2]) == 'O'))
					return "O wins vertically!";
				else
					return "Cat's Games - No Winners!";
			}
		}
	*/

	public String toString()
	{
		String output="";

		for(int row = 0; row < mat.length; row++)
		{
			for(int col = 0; col < mat[0].length; col++)
			{
				output += mat[row][col];
			}
		}
	
		return output + "\n\n";
	}
}