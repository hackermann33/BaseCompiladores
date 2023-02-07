
int f(int a, int b);
int main()
{
    int i, j, k, sum = 0;
    {
        int i, j, k = i + 2;
    }

    i = 3 + 5;
    for (i = 0; i < 10; i++)
    {
        for (j = 0; j < 10; j++)
        {
            k = i * j;
            if (k % 2 == 0)
            {
                int j;
                sum += k;
            }
        }
    }
    while (sum > 100)
    {
        sum -= 50;
    }
    if (sum < 50)
    {
        i = 3;
        return 123;
    }
    else
    {
        i = 4;
        return 123;
    }

    do
    {
        sum += 3;

    } while (sum < 100);
}
