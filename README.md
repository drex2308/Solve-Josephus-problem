# Josephus Problem Solver

## Overview

This repository contains my implementation of the `Josephus` class, which solves the classic Josephus problem using different data structures. The goal of this project was to understand how Queue/Deque can be used as an aid in an algorithm and to explore and compare different data structures (`ArrayDeque` and `LinkedList`) to solve the same problem efficiently.

## Description

The Josephus problem involves people standing in a circle waiting to be executed. A certain number of people are skipped, and then one person is executed. This process is repeated until only one person remains. The objective is to determine the position to stand in to be the last person remaining.

In this project, I implemented three methods to solve the Josephus problem using `ArrayDeque` and `LinkedList`. The methods are designed to determine the survivor's position efficiently, even for large input sizes.

## Features

- **Methods**:
  - `int playWithAD(int size, int rotation)`: Solves the problem using `ArrayDeque`.
  - `int playWithLL(int size, int rotation)`: Solves the problem using `LinkedList` with basic operations.
  - `int playWithLLAt(int size, int rotation)`: Solves the problem using `LinkedList` with index-based operations.

- **Implementation Details**:
  - **Efficient Elimination**: The algorithms are designed to find the elimination position without rotating the circle more than its current size in each iteration.
  - **Handling Edge Cases**: The methods throw a `RuntimeException` for invalid input values (e.g., negative size or rotation).
  - **Comparison of Data Structures**: The project compares the performance of `ArrayDeque` and `LinkedList` in solving the Josephus problem.

## Usage

To use the `Josephus` class, create an instance and call its methods, or run the provided driver program in the repository.

## Learnings

- **Queue/Deque Utilization**: I learned how to effectively use `Queue` and `Deque` structures in Java to implement complex algorithms.
- **Data Structure Comparison**: By implementing the Josephus problem using both `ArrayDeque` and `LinkedList`, I gained insights into the performance differences and suitability of these data structures for specific tasks.
- **Efficiency Considerations**: The project emphasized the importance of optimizing algorithms to handle large input sizes efficiently, particularly in terms of time complexity.
- **Problem-Solving**: I developed problem-solving skills by handling edge cases and ensuring the robustness of the implementation.

## Conclusion

This project was a valuable experience in understanding the intricacies of using different data structures to solve the same problem. The `Josephus` class provides an efficient solution to the Josephus problem using `ArrayDeque` and `LinkedList`, offering a practical comparison of these data structures in a real-world scenario.
