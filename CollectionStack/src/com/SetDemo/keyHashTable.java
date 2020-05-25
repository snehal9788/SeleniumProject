package com.SetDemo;

public class keyHashTable {
int i;
public void key(int x) {
	i=x;
}
public int hashCode() {
	return i%4;
}
public String toString() {
	return i+"";
}
}
