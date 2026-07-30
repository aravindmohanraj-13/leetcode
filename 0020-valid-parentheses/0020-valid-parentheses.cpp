class Solution {
public:
    bool isValid(string s) {
        stack<char>a;
        for (char c:s) {
            if(c=='('||c=='['||c=='{'){
                a.push(c);
            } else {
                if(a.empty()) {
                    return false;
                }
                char top=a.top();
                a.pop();
                if(c==')'&&top!='(') 
                return false;
                if(c==']'&&top!='[') 
                return false;
                if(c=='}'&&top!='{') 
                return false;
            }
        }
        return a.empty();
    }
};