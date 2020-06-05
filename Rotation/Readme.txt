Rotation (left & right rotation)

When a left rotation is applied to the root, apparently the root is changed. 
One right rotation will restore the tree back to the original 

Input {
    7
    30 15 40 5 20 35 45 
}

Output {
    in-order: 5 15 20 30 35 40 45
    before rotation:
    pre-order: 30 15 5 20 40 35 45 
    after rotation left: 
    pre-order: 40 30 15 5 20 35 45 
    after rotating right: 
    pre-order: 30 15 5 20 40 35 45
}