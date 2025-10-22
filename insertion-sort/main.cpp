#include <iostream>
using namespace std;
void insertion_sort(int a[], int s) {
  for (int i = 1; i < s; i++) {
    int temp = a[i];
    int j = i;
    while (j >= 0 && a[j - 1] >= temp) {
      a[j] = a[j - 1];
      j--;
    }
    a[j] = temp;
    }
  }

int main()
{

  int s = 0;
  int a[100]{};
  cout << "Enter Array's size" << endl;
  cin >> s;
  cout << "Enter Array's Elements" << endl;
  for (int i = 0; i < s; i++)
    cin >> a[i];
  cout << "Your Array before sort =" << endl;
  for (int i = 0; i < s; i++)
    cout << a[i] << endl;
  insertion_sort(a, s);
  cout << "Your Array after sort =" << endl;
  for (int i = 0; i < s; i++)
    cout << a[i] << endl;
    return 0;
}
