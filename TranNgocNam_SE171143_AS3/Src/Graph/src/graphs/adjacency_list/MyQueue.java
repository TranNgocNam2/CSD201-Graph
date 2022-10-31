/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.adjacency_list;

import java.util.LinkedList;

/**
 *
 * @author ADMIN
 */
public class MyQueue <T> extends LinkedList<T>{

        public MyQueue() {
            super();
        }

        public void enqueue(T x) {
            this.addLast(x);
        }

        public T dequeue() {
            return this.poll();
        }
    }
