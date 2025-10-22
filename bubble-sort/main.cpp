#include <iostream>
using namespace std;
void bubble_sort(int a[], int len) {
	int temp = 0;
	for (int i = 0; i < len - 1; i++)
	for (int j = 0; j < len - 1 - i; j++)
			if (a[j] > a[j + 1]) {
				temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
}
int main()
{
	int a[100];
	int s = 0;
	cout << "enter the size" << endl;
	cin >> s;
	cout << "enter the array" << endl;
	for (int i = 0; i < s; i++)
		cin >> a[i];
	cout << "ther array befor sort" << endl;
	for (int i = 0; i < s; i++)
		cout << a[i] << endl;
	bubble_sort(a, s);
	cout << "ther array after sort" << endl;
	for (int i = 0; i < s; i++)
		cout << a[i] << endl;
	return 0;
}
