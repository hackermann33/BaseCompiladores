// Function to find factorial
// of given number
int factorial(int n)
{
    if (n == 0){
        return 1;
    return n * factorial(n - 1);
    }
}
// Driver code
int main()
{
    int num = 5;
    printf(num, factorial(num));
    return 0;
}