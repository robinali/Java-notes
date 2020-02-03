class Solution(object):
    def canFinish(self, numCourses, prerequisites):
        """
        :type numCourses: int
        :type prerequisites: List[List[int]]
        :rtype: bool
        """
        
        degrees = [0] * numCourses
        parents = [[] for x in range(numCourses)]
        for pair in prerequisites:
          degrees[pair[1]] += 1
          parents[pair[0]].append(pair[1])
        courses = set(range(numCourses))
        flag = True
        while flag and len(courses):
          flag = False
          removeList = []
          for x in courses:
            if degrees[x] == 0:
              for parent in parents[x]:
                degrees[parent] -= 1
              removeList.append(x)
              flag = True
          for x in removeList:
            courses.remove(x)
        return len(courses) == 0