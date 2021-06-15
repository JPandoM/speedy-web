package com.gimbernat.speedy_web.global;

import java.util.ArrayList;
import java.util.List;

import com.gimbernat.speedy_web.model.Product;

public class GlobalData {
	public static List<Product> cart;
	static {
		cart = new ArrayList<Product>();
	}
}
