import request from '@/utils/request'

// 查询花名册列表
export function listArchives(query) {
  return request({
    url: '/personnel/archives/list',
    method: 'get',
    params: query
  })
}

// 查询花名册详细
export function getArchives(id) {
  return request({
    url: '/personnel/archives/' + id,
    method: 'get'
  })
}

// 新增花名册
export function addArchives(data) {
  return request({
    url: '/personnel/archives',
    method: 'post',
    data: data
  })
}

// 修改花名册
export function updateArchives(data) {
  return request({
    url: '/personnel/archives',
    method: 'put',
    data: data
  })
}

// 删除花名册
export function delArchives(id) {
  return request({
    url: '/personnel/archives/' + id,
    method: 'delete'
  })
}
