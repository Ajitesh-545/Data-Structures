package LAB05;

import java.util.Scanner;

public class NumberList {
	
	public Number head;
	static int total = 0;

	static class Number { 

        public int num; 
        Number next;

        Number(int d) { 
        	num = d;
            next = null; 
        }
        
        public int getNum() {
        	return num;
        }

	}

    public void init() { 
        
    	Scanner sc = new Scanner(System.in);
		
		int inpCnt = 0;
		System.out.print("Enter the Number of Nodes : ");
		inpCnt = sc.nextInt();
		
		while (inpCnt != 0) {
			System.out.print("Enter Number : ");
			int _num = sc.nextInt();
			this.addNumber(_num);
			inpCnt--;
		}
		
    } 

    public void addNumber(int _num) { 
        
        total++;
        Number new_node = new Number(_num); 
        new_node.next = null; 

        if (this.head == null) { 
        	this.head = new_node; 
        }
        else { 

            Number last = this.head; 
            while (last.next != null) { 
                last = last.next; 
            } 

            last.next = new_node; 
        }
    } 

	public void print() { 
		 Number currNode = this.head; 
	     System.out.print("Number List : "); 

	     while (currNode != null) { 
	         System.out.print(currNode.num + " "); 
	         currNode = currNode.next; 
	     } 
	 } 

	public void print(int _skip) { 
		 Number currNode = this.head; 
		 int skip = _skip;
	     System.out.print("Number List : "); 

	     while (currNode != null) { 
	    	 if(skip != 0) {
	    		 System.out.print(currNode.num + " "); 
		         skip--;
	    	 }
	    	 else {
	    		 skip = _skip;
	    	 }  
	    	 currNode = currNode.next;
	     }
	 } 

    public void deleteNumber(int _name) { 
        total--;
        Number currNode = this.head; 

        while (currNode != null) { 
            if(currNode.num == _name) {
                currNode.next = currNode.next.next;
                break;
            }
            else {
                currNode = currNode.next;
            }
        }
    } 

	public boolean isNumber(int _num) { 
		 Number currNode = this.head; 

	     while (currNode != null) { 
	    	 if(currNode.num == _num) {
	        	 return true;
	         }
	         else {
	        	 currNode = currNode.next;
	         }
	     }
	     return false; 
	 }

    public int getNumberByIndex(int _index, boolean _reverse) { 
        Number currNode = this.head; 
        
        if(_reverse = true) {
        	_index = total - _index;
        }
  
        int cnt = 0;
        
        while (currNode != null) { 
        	if(cnt == _index) {
                return currNode.num;
            }
        	currNode = currNode.next;
        	cnt++;
        }
        
        return -1; 
    }

    public int getNumberByIndex(int _index) {
    	return getNumberByIndex(_index, false);
    }

    public void unique() { 
    	
        Number currNode = this.head; 
        NumberList uniqueList = new NumberList();
        while (currNode != null) { 
        	if(uniqueList.isNumber(currNode.num) == false) {
        		uniqueList.addNumber(currNode.num);
        	}
        	currNode = currNode.next;
        }
        this.head = uniqueList.head;
    }

    public void swap(int x, int y) { 
    	
        if (x == y) return; 
  
        Number befX = null, curX = this.head;
        
        while (curX != null && curX.num != x) {
            befX = curX; 
            curX = curX.next; 
        } 

        Number befY = null, curY = this.head; 
        while (curY != null && curY.num != y) { 
            befY = curY; 
            curY = curY.next; 
        }

		if (curX == null || curY == null) return; 
 
        if (befX != null) 
            befX.next = curY; 
        else
            head = curY; 

        if (befY != null) 
            befY.next = curX; 
        else
            head = curX; 

        Number temp = curX.next; 
        curX.next = curY.next; 
        curY.next = temp; 
    }

	public void join(NumberList l2){
		this.total += l2.total;

        if (this.head == null) { 
        	this.head = l2.head;
        }
        else {
        	Number last = this.head; 
            while (last.next != null) { 
                last = last.next; 
            }
            last.next = l2.head; 
        } 
	}

    public void reverse() { 
    	Number prev = null; 
    	Number current = this.head; 
    	Number next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        this.head = prev;
    }    
    
} 
