#pragma once
#include <iostream>
#include <string>
#include <vector>

using namespace std;

//int lambSkewers(int n, int k) 
// {
//    int answer = 0;
//
//    answer = (n * 12000) + (k * 2000);
//
//    if (n >= 10)
//    {
//        int serviceValue = ((n / 10) * 2000);
//        answer -= serviceValue;
//    }
//    
//
//    return answer;
//}

//int taller(vector<int> array, int height) 
// {
//    int answer = 0;
//    for (int i = 0; i < array.size(); i++)
//        if (array[i] > height)
//            answer++;
//
//    return answer;
//}

//vector<int> flipArray(vector<int> num_list)
//{
//	int index = 0;
//	vector <int> answer(num_list.size());
//
//	for (int i = num_list.size() - 1; i >= 0; i--)
//	{
//		answer[index] = num_list[i];
//		index++;
//	}
//
//	return answer;
//}

//vector<int> arrayDouble(vector<int> numbers) 
// {
//    int len = numbers.size();
//    vector<int> answer(len);
//
//    for (int i = 0; i < len; i++)
//    {
//        answer[i] = numbers[i] * 2;
//    }
//
//    return answer;
//}

int slicePizza3(int slice, int n)
{
	int answer = 1;
	int totalSlice = slice * answer;
	while (totalSlice / n >= 1 && slice != n)
	{
		totalSlice = slice * answer;
		answer++;
	}


	return answer;
}