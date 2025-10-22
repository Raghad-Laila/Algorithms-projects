#include <iostream>
using namespace std;
void selection_sort(int a[], int s) {
  for (int i = 0; i < s; i++) {
    int n = i;
    for (int j = i + 1; j < s; j++)
      if (a[j] < a[n])
        n = j;
    swap(a[i], a[n]);
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
  selection_sort(a, s);
  cout << "Your Array after sort =" << endl;
  for (int i = 0; i < s; i++)
    cout << a[i] << endl;
}
