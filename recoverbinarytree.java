void recoverTree(TreeNode *h) {
    TreeNode *f1, *f2;
    bool found = false;
    TreeNode *pre, *par = 0; // previous AND parent
    while(h) { // Morris Traversal
        if(h->left == 0) {
            if(par && par->val > h->val) {  // inorder previous is: par
                if(!found) {
                    f1 = par;
                    found = true;
                }
                f2 = h;
            }
            par = h;
            h = h->right;
            continue;
        }
        pre = h->left;
        while(pre->right != 0 && pre->right != h) 
            pre = pre->right;
        if(pre->right == 0) {
            pre->right = h;
            h = h->left;
        } else {
            pre->right = 0;
            if(pre->val > h->val) { // inorder previous is: pre
                if(!found) {
                    f1 = pre;
                    found =true;
                }
                f2 = h;
            }
            par = h;
            h = h->right;
        }
    }
    if(found)
        swap(f1->val, f2->val);
}

