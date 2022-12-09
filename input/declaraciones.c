int f2(int a, int b);

int main()
{
  {
    int a;
    {
    int a, b = 4;
    int c = f2(1, 2 * 3 * 4, a);
    return a;
    }
  }
}

// int f2(int a, int b){

//   return 0;
// }
