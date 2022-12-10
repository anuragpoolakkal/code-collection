// C++ program to print pell series.

#include <iostream>
using namespace std;

int pell(int num)
{
	if (num <= 2)
		return num;
	else
		return (2 * pell(num - 1) + pell(num - 2));
}

int main()
{
	int num;
	cout << "Enter number/limit: ";
	cin >> num;
	cout << "Pell number at position " << num << " is: " << pell(num);
	cout << "\nPell series till position " << num << " is: ";
	for (int i = 0; i <= num; i++)
	{
		cout << pell(i) << "  ";
	}
}