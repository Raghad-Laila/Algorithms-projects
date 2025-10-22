#include <iostream>
using namespace std;

void quick_sort(int a[], int low, int high) {
  if (low < high) {
    int pivot = a[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
      if (a[j] < pivot) {
        i++;
        swap(a[i], a[j]);
      }
    }
    swap(a[i + 1], a[high]);
    int pi = i + 1;

    quick_sort(a, low, pi - 1);
    quick_sort(a, pi + 1, high);
  }
}

int main() {
  int a[100], s;
  cout << "Enter array size: ";
  cin >> s;
  cout << "Enter array elements:\n";
  for (int i = 0; i < s; i++)
    cin >> a[i];

  cout << "Array before sort:\n";
  for (int i = 0; i < s; i++)
    cout << a[i] << " ";

  quick_sort(a, 0, s - 1);

  cout << "\nArray after sort:\n";
  for (int i = 0; i < s; i++)
    cout << a[i] << " ";

  return 0;
}
