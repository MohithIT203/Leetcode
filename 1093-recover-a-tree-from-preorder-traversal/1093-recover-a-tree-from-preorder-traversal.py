# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def recoverFromPreorder(self, traversal):
        stack = []  # Stack to maintain nodes and their depth
        i = 0  # Pointer for traversal

        while i < len(traversal):
            depth = 0
            # Count the number of dashes to determine depth
            while i < len(traversal) and traversal[i] == '-':
                depth += 1
                i += 1

            # Read the number (node value)
            num_start = i
            while i < len(traversal) and traversal[i].isdigit():
                i += 1
            node_val = int(traversal[num_start:i])

            # Create a new node
            node = TreeNode(node_val)

            # Maintain the correct parent-child relationship
            while len(stack) > depth:
                stack.pop()

            if stack:
                if not stack[-1].left:
                    stack[-1].left = node
                else:
                    stack[-1].right = node

            # Push the new node to the stack
            stack.append(node)

        # Return the root of the tree (first element in the stack)
        return stack[0]

        